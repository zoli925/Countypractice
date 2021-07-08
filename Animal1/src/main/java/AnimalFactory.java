public class AnimalFactory {


    public Animal create(String animal) {
        // implement this method so that it returns
        // the correct Animal instance
        // based on the animal
       /* switch (animal) {
            case "cat":
                return new Cat();
           case "dog":
                return new Dog();
            case "duck":
                return new Duck();
            case "cow":
                return new Cow();
            default:
                return null;
        }*/
        if (animal == "cat")
        return new Cat();

        else if (animal == "dog")
            return new Dog();

        else if (animal == "duck")
        return new Duck();

        else if (animal == "cow");
        return new Cow();






    }
}
