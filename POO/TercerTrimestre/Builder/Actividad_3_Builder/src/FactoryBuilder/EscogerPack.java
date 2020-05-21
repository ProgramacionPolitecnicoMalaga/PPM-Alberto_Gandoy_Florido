package FactoryBuilder;

import PackBuilder.*;
import PackBuilder.TipoDePack;
import Producto.Pack;

public class EscogerPack {
    private PackDirector packDirector;

    public EscogerPack(PackBuilder packBuilder) {
        this.packDirector = new PackDirector(packBuilder);
    }

    public Pack selectorPack(TipoDePack tipoDePack) {
       if (tipoDePack == TipoDePack.BASICO)
           return packDirector.getBasico();
       else if (tipoDePack == TipoDePack.ROMANTICO)
           return packDirector.getRomantico();
       else if (tipoDePack == TipoDePack.FAMILIAR)
           return packDirector.getFamiliar();
       else if (tipoDePack == TipoDePack.PADRES_RELAJADOS)
           return packDirector.getPadresRelajados();
       else if (tipoDePack == TipoDePack.DELUXE)
           return packDirector.getDeluxe();
       else if (tipoDePack == TipoDePack.DELUXE_FAMILIAR)
           return packDirector.getDeluxeFamiliar();
       else throw new IllegalArgumentException("El pack no es válido.");
    }
}
d