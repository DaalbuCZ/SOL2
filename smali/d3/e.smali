.class public final Ld3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ls1/h;


# static fields
.field public static final o:Ld3/e;

.field public static final p:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ld3/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Lb5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5/q<",
            "Ld3/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld3/e;

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object v1

    invoke-direct {v0, v1}, Ld3/e;-><init>(Ljava/util/List;)V

    sput-object v0, Ld3/e;->o:Ld3/e;

    sget-object v0, Ld3/d;->a:Ld3/d;

    sput-object v0, Ld3/e;->p:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lb5/q;->F(Ljava/util/Collection;)Lb5/q;

    move-result-object p1

    iput-object p1, p0, Ld3/e;->n:Lb5/q;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ld3/e;
    .locals 0

    invoke-static {p0}, Ld3/e;->b(Landroid/os/Bundle;)Ld3/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroid/os/Bundle;)Ld3/e;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ld3/e;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Lb5/q;->J()Lb5/q;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Ld3/b;->F:Ls1/h$a;

    invoke-static {v0, p0}, Lp3/c;->b(Ls1/h$a;Ljava/util/List;)Lb5/q;

    move-result-object p0

    :goto_0
    new-instance v0, Ld3/e;

    invoke-direct {v0, p0}, Ld3/e;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private static c(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x24

    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
