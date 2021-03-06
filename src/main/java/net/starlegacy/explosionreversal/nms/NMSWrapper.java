package net.starlegacy.explosionreversal.nms;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

import javax.annotation.Nullable;

public interface NMSWrapper {
    @Nullable
    byte[] getTileEntity(Block block);

    void setTileEntity(Block block, byte[] data);

    @Nullable
    byte[] getEntityData(Entity entity);

    void restoreEntityData(Entity entity, byte[] data);
}
