Before session
                                               ---
                                               - Delete services and dtos folder and classes
                                               - return the rest controller to normal repository functions
                                               
                                               During session
                                               ---
                                               - Go over pageable list of pets @GetMapping and show what is returned
                                               - What if I want to say spayedOrNeutered instead of fixed?
                                               - Often we dont want to share certain parts of our data that we get back from the database
                                               - Or we might want to make it more readable so it makes more sense to those who use it
                                               
                                               - So we can use a Data Transfer Object or DTO to make a translation of our object/Entity
                                               - Lets change the fixed, to spayedOrNeutered using our DTO, and change or age.
                                               
                                               - Create a package called DTOs
                                               - Create a PetDto // DTO is common and general convention in Java, can name something else.
                                               - We can use lombok to define @Getter and @Setter and @NoArgsContructor
                                               
                                               - Create fields that will map/mirror the pet model
                                               - Wont require any validations since the DTO is only used for presentation to outside
                                               - Add Id, name, breed, species.
                                               - Add dogYears, spayedOrNeurtered
                                               - create public static PetDto fromPet(Pet pet){
                                               - add PetDto dto
                                               - fill in method
                                               
                                               - dogyears gets getAge * 7, add private static final DOG_YEARS
                                               - add spayed or neutered conditional
                                               
                                               - Create new layer/package services
                                               - Create PetService that mirrors petRepository
                                               - use a Page findall to return info
                                               - create PetService contructor using PetsRepository
                                               
                                               - Use PageImpl from article to use our PetDto
                                               - Create a List<PetDto>
                                               - Loop through petsFromDb.getContent
                                               - This creates a list of translated Dto objects for the frontend
                                               
                                               - In RestController, add in the PetService to take the place of PetsRepository
                                               - Rebuild app and check the api JSON in browser