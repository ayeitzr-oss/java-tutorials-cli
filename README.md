## Run on macOS (Terminal)
```bash
java --version

git clone https://github.com/ayeitzr-oss/java-tutorials-cli.git
cd java-tutorials-cli
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out com.learnjava.Menu

