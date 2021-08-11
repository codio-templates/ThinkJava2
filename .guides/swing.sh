#!/bin/bash
set -e 
set -o pipefail

. /etc/profile.d/codio-xserver.sh

$1 $2
$3 $4
sudo nohup $5 $6 &> /dev/null &