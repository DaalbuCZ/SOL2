.class public abstract Lz9/g1;
.super Lz9/d0;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz9/g1$a;
    }
.end annotation


# static fields
.field public static final p:Lz9/g1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz9/g1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz9/g1$a;-><init>(Ls9/g;)V

    sput-object v0, Lz9/g1;->p:Lz9/g1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz9/d0;-><init>()V

    return-void
.end method
