package org.example.Tp.factory;

import org.example.Tp.entity.AbstractBatiment;
import org.example.Tp.entity.Batiment;

public abstract class BatimentFatory {
    public abstract Batiment createBatiment(AbstractBatiment builder);
}
