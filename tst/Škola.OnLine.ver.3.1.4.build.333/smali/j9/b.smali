.class public abstract Lj9/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj9/g$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "Lj9/g$b;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "Lj9/g$c<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final n:Lr9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/l<",
            "Lj9/g$b;",
            "TE;>;"
        }
    .end annotation
.end field

.field private final o:Lj9/g$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/g$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/g$c;Lr9/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$c<",
            "TB;>;",
            "Lr9/l<",
            "-",
            "Lj9/g$b;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj9/b;->n:Lr9/l;

    instance-of p2, p1, Lj9/b;

    if-eqz p2, :cond_0

    check-cast p1, Lj9/b;

    iget-object p1, p1, Lj9/b;->o:Lj9/g$c;

    :cond_0
    iput-object p1, p0, Lj9/b;->o:Lj9/g$c;

    return-void
.end method


# virtual methods
.method public final a(Lj9/g$c;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$c<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    iget-object v0, p0, Lj9/b;->o:Lj9/g$c;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b(Lj9/g$b;)Lj9/g$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/g$b;",
            ")TE;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj9/b;->n:Lr9/l;

    invoke-interface {v0, p1}, Lr9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj9/g$b;

    return-object p1
.end method
