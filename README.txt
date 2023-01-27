Notes for our developers:
-------------------------
To add a food item:

1) java -> client -> ModelRegistrationHandler
    Add the new item here

2) java -> init -> ModItems
    Add the new item here

3) java -> RegistrationHandler
    Add the new item here
    Define its health-giving amount (a whole number of hearts) and its saturation value.

4) resources -> lang/en-us.lang
    Add a language entry to display the item in game

5) resources -> models/item
    Add a model for the item (use the filename of the texture in this, without the .png)

6) resources -> textures/items
    Copy your .png 16x16 texture file into here

7) resources -> recipes
    Add your recipe for the item in here






Notes for Making an Entry:
--------------------------
1) Copy an existing entry and place it in the correct category
 main -> resources -> assets -> patchouli_books -> book -> en_us -> entries -> [correct category]

2) On the bottom of the file: replace recipe_id with the id of the recipe (name of the json file) and replace "Name" with the name of the dish/ingredient/utensil

        {
			"type": "crafting",
			"recipe": "prehistoricdiner:recipe_id",
			"title": "Name"
		}

3) On the top of the file: replace "Name" with the name of the dish/ingredient/utensil
    replace "item_id" with the id of the item (this is what you would use to /give yourself the item ingame)
    replace "category" with the name of the category this entry belongs to


	"name": "Name",
	"icon": "prehistoricdiner:item_id",
	"category": "prehistoricdiner:category",

	The current categories in the code are "recipes" and "utensils".

4) Next replace "username" with your discord handle or whatever name you prefer
    after the $(br) you may write a short description about the item

        {
			"type": "text",
			"text": "Recipe submitted by username $(br)"
		},