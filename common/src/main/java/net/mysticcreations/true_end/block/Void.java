package net.mysticcreations.true_end.block;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class Void extends Block {

    public Void() {
        super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY)
                .strength(-1.0f, -1.0f)
                .hasPostProcess((bs, br, bp) -> true)
                .lightLevel(s -> 1).emissiveRendering((bs, br, bp) -> true)
        );
    }

    @Override
    public void appendHoverText(ItemStack stack, BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder lootContext) {
        return Collections.emptyList();
    }
}
