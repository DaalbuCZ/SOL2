.class public final Lk0/l$a;
.super Lk0/u$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk0/u$a<",
        "Lk0/l$a;",
        "Lk0/l;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/ListenableWorker;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lk0/u$a;-><init>(Ljava/lang/Class;)V

    iget-object p1, p0, Lk0/u$a;->c:Ls0/p;

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ls0/p;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method bridge synthetic c()Lk0/u;
    .locals 1

    invoke-virtual {p0}, Lk0/l$a;->h()Lk0/l;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic d()Lk0/u$a;
    .locals 1

    invoke-virtual {p0}, Lk0/l$a;->i()Lk0/l$a;

    move-result-object v0

    return-object v0
.end method

.method h()Lk0/l;
    .locals 2

    iget-boolean v0, p0, Lk0/u$a;->a:Z

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lk0/u$a;->c:Ls0/p;

    iget-object v0, v0, Ls0/p;->j:Lk0/b;

    invoke-virtual {v0}, Lk0/b;->h()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot set backoff criteria on an idle mode job"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Lk0/l;

    invoke-direct {v0, p0}, Lk0/l;-><init>(Lk0/l$a;)V

    return-object v0
.end method

.method i()Lk0/l$a;
    .locals 0

    return-object p0
.end method
