
@echo off
>output.txt (
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np6 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np6 class=B
)
