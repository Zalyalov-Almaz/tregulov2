package _30IO_NIO.FilesWalkFileTree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Example {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\zalya\\Desktop\\X");
        Files.walkFileTree(path, new MyFileVisitor());

    }
}
class MyFileVisitor implements FileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Entering to directory " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Visiting file error " + file.getFileName());
        return FileVisitResult.TERMINATE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exiting from directory " + dir);
        return FileVisitResult.CONTINUE;
    }
}
// FileVisitor - интерфейс содержащий методы обхода по дереву файлов.
// все 4 метода из интерфейса FileVisitor возвращают FileVisitResult:
// preVisitDirectory - срабатывает перед обращением к элементам папки
// visirFile - срабатывает при обращении к файлу
// postVisitDirectory - срабатывает после обращения ко всем элементам папки
// visitFileFaild - срабатывает когда файл по каким-то причинам не доступен.
// FileVisitResult - это enum со значениями:
// CONTINUE - значит нужно продолжить обход по файлам.
// TERMINATE - значит нужно немедленно прекратить обход по файлам.
// SKIP_SUBTREE - значит в эту директорию заходить не надо.
// SKIP_SIBLINGS - значит в этой директории продолжать обход не нужно.