.class Li7/n$y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf7/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/n;->d(Ljava/lang/Class;Lf7/w;)Lf7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/Class;

.field final synthetic o:Lf7/w;


# direct methods
.method constructor <init>(Ljava/lang/Class;Lf7/w;)V
    .locals 0

    iput-object p1, p0, Li7/n$y;->n:Ljava/lang/Class;

    iput-object p2, p0, Li7/n$y;->o:Lf7/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lf7/e;Lm7/a;)Lf7/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lf7/e;",
            "Lm7/a<",
            "TT2;>;)",
            "Lf7/w<",
            "TT2;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lm7/a;->c()Ljava/lang/Class;

    move-result-object p1

    iget-object p2, p0, Li7/n$y;->n:Ljava/lang/Class;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p2, Li7/n$y$a;

    invoke-direct {p2, p0, p1}, Li7/n$y$a;-><init>(Li7/n$y;Ljava/lang/Class;)V

    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Factory[typeHierarchy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li7/n$y;->n:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li7/n$y;->o:Lf7/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
