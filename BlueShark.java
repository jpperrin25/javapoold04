public class BlueShark extends Shark {

    public BlueShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        return animal instanceof Shark || animal.getType().equals("fish");
    }
}