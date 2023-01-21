## Head Extractor

Head Extractor is a tool to extract the player profile from the player heads in a Minecraft world.

This is accomplished somewhat inefficiently by searching chunk NBT, player data NBT, and entity NBT for lists of
Compound tags that contain a String tag named `Value`.\
In addition, `mcfunction` and `json` files in data packs are scanned for Base64 encoded player profiles.  

### Compiling
1. Clone the repository
2. Run `./gradlew build` or `gradlew.bat build`
3. Tool is located at `build/libs/HeadExtractor-<VERSION>-all.jar`

### Running
`java -jar HeadExtractor-<VERSION>-all.jar <WORLD DIRECTORY>`

Player profiles are sent line by line to standard output. 
