package me.luligabi.entitymobiles.projecttablemod.common.block;

import me.luligabi.entitymobiles.projecttablemod.common.ProjectTableMod;
import me.luligabi.entitymobiles.projecttablemod.common.block.projecttable.ProjectTableBlock;
import me.luligabi.entitymobiles.projecttablemod.common.block.projecttable.ProjectTableBlockEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockRegistry {

    public static void init() {
        initBlock("project_table", PROJECT_TABLE);
        PROJECT_TABLE_ENTITY_TYPE = Registry.register(Registries.BLOCK_ENTITY_TYPE, ProjectTableMod.id("project_table"), FabricBlockEntityTypeBuilder.create(ProjectTableBlockEntity::new, PROJECT_TABLE).build());
    }


    public static final Block PROJECT_TABLE = new ProjectTableBlock();
    public static BlockEntityType<ProjectTableBlockEntity> PROJECT_TABLE_ENTITY_TYPE;


    private static void initBlock(String identifier, Block block) {
        Registry.register(Registries.BLOCK, ProjectTableMod.id(identifier), block);
        Registry.register(Registries.ITEM, ProjectTableMod.id(identifier), new BlockItem(block, new FabricItemSettings()));
    }

    public BlockRegistry() {
        // NO-OP
    }

}
