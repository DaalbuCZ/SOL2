.class public final Lr9/d0$a;
.super Lb9/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb9/b<",
        "Lb9/e;",
        "Lr9/d0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    sget-object v0, Lb9/e;->b:Lb9/e$b;

    sget-object v1, Lr9/d0$a$a;->o:Lr9/d0$a$a;

    invoke-direct {p0, v0, v1}, Lb9/b;-><init>(Lb9/g$c;Lj9/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lk9/g;)V
    .locals 0

    invoke-direct {p0}, Lr9/d0$a;-><init>()V

    return-void
.end method
