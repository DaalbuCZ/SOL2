.class final Lb5/k0$b;
.super Lb5/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lb5/s<",
        "TK;>;"
    }
.end annotation


# instance fields
.field private final transient p:Lb5/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/r<",
            "TK;*>;"
        }
    .end annotation
.end field

.field private final transient q:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lb5/r;Lb5/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb5/r<",
            "TK;*>;",
            "Lb5/q<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lb5/s;-><init>()V

    iput-object p1, p0, Lb5/k0$b;->p:Lb5/r;

    iput-object p2, p0, Lb5/k0$b;->q:Lb5/q;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    iget-object v0, p0, Lb5/k0$b;->p:Lb5/r;

    invoke-virtual {v0, p1}, Lb5/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d()Lb5/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb5/q<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lb5/k0$b;->q:Lb5/q;

    return-object v0
.end method

.method g([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lb5/k0$b;->d()Lb5/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lb5/q;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lb5/k0$b;->v()Lb5/s0;

    move-result-object v0

    return-object v0
.end method

.method s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lb5/k0$b;->p:Lb5/r;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public v()Lb5/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb5/s0<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lb5/k0$b;->d()Lb5/q;

    move-result-object v0

    invoke-virtual {v0}, Lb5/q;->v()Lb5/s0;

    move-result-object v0

    return-object v0
.end method
