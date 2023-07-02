.class public final Lz9/d0$a;
.super Lj9/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz9/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj9/b<",
        "Lj9/e;",
        "Lz9/d0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lj9/e;->k:Lj9/e$b;

    sget-object v1, Lz9/d0$a$a;->o:Lz9/d0$a$a;

    invoke-direct {p0, v0, v1}, Lj9/b;-><init>(Lj9/g$c;Lr9/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Lz9/d0$a;-><init>()V

    return-void
.end method
