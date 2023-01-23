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