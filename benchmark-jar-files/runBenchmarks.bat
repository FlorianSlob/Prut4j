	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np24 class=B
@echo off
>output.txt (
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG-alt -np24 class=B
)
