# Java Compiler
JC := javac

# Maven
MVN := mvn

# Application entry point (main class)
MAIN := com.progresssoft.fxdeals

# Source files directory
SRCDIR := src

# Output directory for compiled files
BINDIR := bin

# Target JAR file
TARGET := application.jar

# Default rule
all: clean compile package

# Rule to compile Java source files
compile: $(SRCDIR)
	$(MVN) compile

# Rule to package the application
package:
	$(MVN) package

# Rule to run the application
run:
	$(MVN) spring-boot:run

# Rule to clean generated files
clean:
	$(MVN) clean
	rm -rf $(BINDIR) $(TARGET)
