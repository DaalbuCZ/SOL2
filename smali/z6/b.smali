.class final Lz6/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final d:Lu6/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Li6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li6/b<",
            "Le1/g;",
            ">;"
        }
    .end annotation
.end field

.field private c:Le1/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le1/f<",
            "Lb7/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lu6/a;->e()Lu6/a;

    move-result-object v0

    sput-object v0, Lz6/b;->d:Lu6/a;

    return-void
.end method

.method constructor <init>(Li6/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li6/b<",
            "Le1/g;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz6/b;->a:Ljava/lang/String;

    iput-object p1, p0, Lz6/b;->b:Li6/b;

    return-void
.end method

.method private a()Z
    .locals 5

    iget-object v0, p0, Lz6/b;->c:Le1/f;

    if-nez v0, :cond_1

    iget-object v0, p0, Lz6/b;->b:Li6/b;

    invoke-interface {v0}, Li6/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le1/g;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz6/b;->a:Ljava/lang/String;

    const-class v2, Lb7/i;

    const-string v3, "proto"

    invoke-static {v3}, Le1/b;->b(Ljava/lang/String;)Le1/b;

    move-result-object v3

    sget-object v4, Lz6/a;->a:Lz6/a;

    invoke-interface {v0, v1, v2, v3, v4}, Le1/g;->a(Ljava/lang/String;Ljava/lang/Class;Le1/b;Le1/e;)Le1/f;

    move-result-object v0

    iput-object v0, p0, Lz6/b;->c:Le1/f;

    goto :goto_0

    :cond_0
    sget-object v0, Lz6/b;->d:Lu6/a;

    const-string v1, "Flg TransportFactory is not available at the moment"

    invoke-virtual {v0, v1}, Lu6/a;->j(Ljava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lz6/b;->c:Le1/f;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method


# virtual methods
.method public b(Lb7/i;)V
    .locals 1

    invoke-direct {p0}, Lz6/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lz6/b;->d:Lu6/a;

    const-string v0, "Unable to dispatch event because Flg Transport is not available"

    invoke-virtual {p1, v0}, Lu6/a;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz6/b;->c:Le1/f;

    invoke-static {p1}, Le1/c;->d(Ljava/lang/Object;)Le1/c;

    move-result-object p1

    invoke-interface {v0, p1}, Le1/f;->b(Le1/c;)V

    return-void
.end method
