.class public final Ls1/q3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/q3$a;
    }
.end annotation


# static fields
.field public static final o:Ls1/q3;

.field public static final p:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/q3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final n:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Ls1/q3$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls1/q3;

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object v1

    invoke-direct {v0, v1}, Ls1/q3;-><init>(Ljava/util/List;)V

    sput-object v0, Ls1/q3;->o:Ls1/q3;

    sget-object v0, Ls1/o3;->a:Ls1/o3;

    sput-object v0, Ls1/q3;->p:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls1/q3$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lb5/q;->F(Ljava/util/Collection;)Lb5/q;

    move-result-object p1

    iput-object p1, p0, Ls1/q3;->n:Lb5/q;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/q3;
    .locals 0

    invoke-static {p0}, Ls1/q3;->e(Landroid/os/Bundle;)Ls1/q3;

    move-result-object p0

    return-object p0
.end method

.method private static d(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic e(Landroid/os/Bundle;)Ls1/q3;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ls1/q3;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Ls1/q3$a;->s:Ls1/h$a;

    invoke-static {v0, p0}, Lp3/c;->b(Ls1/h$a;Ljava/util/List;)Lb5/q;

    move-result-object p0

    :goto_0
    new-instance v0, Ls1/q3;

    invoke-direct {v0, p0}, Ls1/q3;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public b()Lb5/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb5/q<",
            "Ls1/q3$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ls1/q3;->n:Lb5/q;

    return-object v0
.end method

.method public c(I)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Ls1/q3;->n:Lb5/q;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ls1/q3;->n:Lb5/q;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/q3$a;

    invoke-virtual {v2}, Ls1/q3$a;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ls1/q3$a;->c()I

    move-result v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Ls1/q3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ls1/q3;

    iget-object v0, p0, Ls1/q3;->n:Lb5/q;

    iget-object p1, p1, Ls1/q3;->n:Lb5/q;

    invoke-virtual {v0, p1}, Lb5/q;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ls1/q3;->n:Lb5/q;

    invoke-virtual {v0}, Lb5/q;->hashCode()I

    move-result v0

    return v0
.end method
