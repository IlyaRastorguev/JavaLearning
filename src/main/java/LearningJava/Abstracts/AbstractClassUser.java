package LearningJava.Abstracts;

public class AbstractClassUser extends AbstractClasses {
    @Override // просто метка в коде
    protected boolean returnBoolean() {
        return false;
    }
}

// если не переопределить метод, то будет ошибка компиляции