.class Lb5/u$a;
.super Lb5/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb5/u;->g(Ljava/util/Iterator;La5/k;)Lb5/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb5/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic p:Ljava/util/Iterator;

.field final synthetic q:La5/k;


# direct methods
.method constructor <init>(Ljava/util/Iterator;La5/k;)V
    .locals 0

    iput-object p1, p0, Lb5/u$a;->p:Ljava/util/Iterator;

    iput-object p2, p0, Lb5/u$a;->q:La5/k;

    invoke-direct {p0}, Lb5/b;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    :cond_0
    iget-object v0, p0, Lb5/u$a;->p:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb5/u$a;->p:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lb5/u$a;->q:La5/k;

    invoke-interface {v1, v0}, La5/k;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lb5/b;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
