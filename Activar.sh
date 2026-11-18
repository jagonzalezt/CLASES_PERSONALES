#!/usr/bin/env bash

# ==============================================================================
# Script de Aprovisionamiento Secuencial - Linux Mint 22.3
# ==============================================================================

# Verificar ejecución con sudo/root
if [ "$EUID" -ne 0 ]; then
  echo "[-] Error: Ejecuta este script con sudo (ejemplo: sudo ./preparar_equipo.sh)"
  exit 1
fi

# Detectar el usuario gráfico real para abrir la ventana de impresoras al final
REAL_USER=${SUDO_USER:-$USER}

# ------------------------------------------------------------------------------
# PASO 1: Configurar el proxy de repositorio local (apt-cacher-ng)
# ------------------------------------------------------------------------------
echo "[1/5] Configurando proxy de repositorio en /etc/apt/apt.conf.d/01proxy..."
echo 'Acquire::http { Proxy "http://reposerver.inss.gob.ni:3142"; };' > /etc/apt/apt.conf.d/01proxy
echo "      Configuración aplicada correctamente."

# ------------------------------------------------------------------------------
# PASO 2: Actualizar lista de paquetes (apt update)
# ------------------------------------------------------------------------------
echo "[2/5] Ejecutando apt update..."
apt update

# ------------------------------------------------------------------------------
# PASO 3: Instalar Firefox y paquete de idioma español
# ------------------------------------------------------------------------------
echo "[3/5] Instalando firefox y firefox-locale-es..."
apt install -y firefox firefox-locale-es

# ------------------------------------------------------------------------------
# PASO 4: Crear usuario local 'usuario' y solicitar contraseña
# ------------------------------------------------------------------------------
echo "[4/5] Configurando usuario local 'usuario'..."

if id "usuario" &>/dev/null; then
    echo "      El usuario 'usuario' ya existe en el sistema."
else
    useradd -m -s /bin/bash usuario
    echo "      Usuario 'usuario' creado correctamente."
fi

echo "      Por favor, ingresa la contraseña que deseas asignarle a 'usuario':"
passwd usuario

# ------------------------------------------------------------------------------
# PASO 5: Abrir el programa de configuración de impresoras
# ------------------------------------------------------------------------------
echo "[5/5] Abriendo gestor de impresoras..."

sudo -u "$REAL_USER" DISPLAY=:0 DBUS_SESSION_BUS_ADDRESS="unix:path=/run/user/$(id -u "$REAL_USER")/bus" system-config-printer &

echo "[+] Proceso completado."
