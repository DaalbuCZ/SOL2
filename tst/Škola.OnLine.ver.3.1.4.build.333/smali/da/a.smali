.class public final Lda/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/g;


# instance fields
.field public final n:Ljava/lang/Throwable;

.field private final synthetic o:Lj9/g;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lj9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/a;->n:Ljava/lang/Throwable;

    iput-object p2, p0, Lda/a;->o:Lj9/g;

    return-void
.end method


# virtual methods
.method public E(Lj9/g;)Lj9/g;
    .locals 1

    iget-object v0, p0, Lda/a;->o:Lj9/g;

    invoke-interface {v0, p1}, Lj9/g;->E(Lj9/g;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lj9/g$c;)Lj9/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$c<",
            "*>;)",
            "Lj9/g;"
        }
    .end annotation

    iget-object v0, p0, Lda/a;->o:Lj9/g;

    invoke-interface {v0, p1}, Lj9/g;->Q(Lj9/g$c;)Lj9/g;

    move-result-object p1

    return-object p1
.end method

.method public c(Lj9/g$c;)Lj9/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lj9/g$b;",
            ">(",
            "Lj9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    iget-object v0, p0, Lda/a;->o:Lj9/g;

    invoke-interface {v0, p1}, Lj9/g;->c(Lj9/g$c;)Lj9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lr9/p<",
            "-TR;-",
            "Lj9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    iget-object v0, p0, Lda/a;->o:Lj9/g;

    invoke-interface {v0, p1, p2}, Lj9/g;->v(Ljava/lang/Object;Lr9/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
