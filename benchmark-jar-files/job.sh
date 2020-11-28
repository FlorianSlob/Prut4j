#!/bin/sh
#SBATCH -N 1
#SBATCH -p normal
#SBATCH -o out.%A
#SBATCH -t 24:00:00

JAR=model-checking-benchmarks-v0.1.jar
MODE=$1 # "Original" or "Updated"
PROGRAM=$2
ITERS=$3

echo "MODE=$1, PROGRAM=$2, ITERS=$3" 
echo
hostname
echo
cat /proc/cpuinfo
echo

for K in $(seq 2 2 24); do
    for I in $(seq 1 $ITERS); do
        java -jar $JAR -run"$MODE"Benchmark -BM=$PROGRAM -np$K class=C
    done
done