.class final Lg5/k0$b;
.super Lg5/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/k0;
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
        "Lg5/s<",
        "TK;>;"
    }
.end annotation


# instance fields
.field private final transient p:Lg5/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/r<",
            "TK;*>;"
        }
    .end annotation
.end field

.field private final transient q:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lg5/r;Lg5/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/r<",
            "TK;*>;",
            "Lg5/q<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg5/s;-><init>()V

    iput-object p1, p0, Lg5/k0$b;->p:Lg5/r;

    iput-object p2, p0, Lg5/k0$b;->q:Lg5/q;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    iget-object v0, p0, Lg5/k0$b;->p:Lg5/r;

    invoke-virtual {v0, p1}, Lg5/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d()Lg5/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/q<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lg5/k0$b;->q:Lg5/q;

    return-object v0
.end method

.method g([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lg5/k0$b;->d()Lg5/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lg5/q;->g([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lg5/k0$b;->v()Lg5/s0;

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

    iget-object v0, p0, Lg5/k0$b;->p:Lg5/r;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public v()Lg5/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg5/s0<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lg5/k0$b;->d()Lg5/q;

    move-result-object v0

    invoke-virtual {v0}, Lg5/q;->v()Lg5/s0;

    move-result-object v0

    return-object v0
.end method
