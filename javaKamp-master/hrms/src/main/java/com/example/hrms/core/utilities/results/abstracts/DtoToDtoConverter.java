package com.example.hrms.core.utilities.results.abstracts;

import java.io.Serializable;
import java.util.Collection;

public interface DtoToDtoConverter<D,E> extends Serializable {

    public abstract E convertToEntity(D d);
    public abstract D convertToDestination(E e);
    public abstract Collection<D> mapListSourceToDestination(Collection<E> entityList);
    public abstract Collection<E> mapListDestinationToEntity(Collection<D> dtoList);

}
