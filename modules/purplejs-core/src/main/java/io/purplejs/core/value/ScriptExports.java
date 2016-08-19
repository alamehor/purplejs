package io.purplejs.core.value;

import io.purplejs.core.resource.ResourcePath;

public interface ScriptExports
{
    ResourcePath getResource();

    ScriptValue getValue();

    boolean hasMethod( String name );

    ScriptValue executeMethod( String name, Object... args );
}