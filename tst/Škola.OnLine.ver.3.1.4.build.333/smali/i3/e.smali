.class public final Li3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# static fields
.field public static final p:Li3/e;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field public static final s:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Li3/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Li3/b;",
            ">;"
        }
    .end annotation
.end field

.field public final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li3/e;

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-direct {v0, v1, v2, v3}, Li3/e;-><init>(Ljava/util/List;J)V

    sput-object v0, Li3/e;->p:Li3/e;

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Li3/e;->q:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Li3/e;->r:Ljava/lang/String;

    sget-object v0, Li3/d;->a:Li3/d;

    sput-object v0, Li3/e;->s:Lx1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li3/b;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lg5/q;->F(Ljava/util/Collection;)Lg5/q;

    move-result-object p1

    iput-object p1, p0, Li3/e;->n:Lg5/q;

    iput-wide p2, p0, Li3/e;->o:J

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Li3/e;
    .locals 0

    invoke-static {p0}, Li3/e;->b(Landroid/os/Bundle;)Li3/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroid/os/Bundle;)Li3/e;
    .locals 3

    sget-object v0, Li3/e;->q:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Li3/b;->W:Lx1/h$a;

    invoke-static {v1, v0}, Lu3/c;->b(Lx1/h$a;Ljava/util/List;)Lg5/q;

    move-result-object v0

    :goto_0
    sget-object v1, Li3/e;->r:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    new-instance p0, Li3/e;

    invoke-direct {p0, v0, v1, v2}, Li3/e;-><init>(Ljava/util/List;J)V

    return-object p0
.end method
