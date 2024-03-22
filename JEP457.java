import java.lang.classfile.ClassFile;
import static java.lang.classfile.ClassFile.*;
import java.lang.constant.ClassDesc;
import java.nio.file.Path;
import java.io.IOException;
import java.lang.constant.MethodTypeDesc;

public class JEP457 {

  public static void main(String[] args) throws IOException {
    ClassFile helloWorldClass = ClassFile.of();
    helloWorldClass.buildTo(Path.of("HelloWorld.class"), ClassDesc.of("HelloWorld"), classBuilder -> {
      classBuilder.withMethodBody("main", MethodTypeDesc.ofDescriptor("([Ljava/lang/String;)V"), ACC_PUBLIC | ACC_STATIC, codeBuilder -> {
        codeBuilder.getstatic(ClassDesc.of("java.lang.System"), "out", ClassDesc.of("java.io.PrintStream"))
          .ldc("Hello World")
          .invokevirtual(ClassDesc.of("java.io.PrintStream"), "println", MethodTypeDesc.ofDescriptor("(Ljava/lang/Object;)V"))
          .return_();
      });
    });
  }

}
