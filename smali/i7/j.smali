.class public final Li7/j;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf7/w<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Lf7/x;


# instance fields
.field private final a:Lf7/e;

.field private final b:Lf7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf7/u;->n:Lf7/u;

    invoke-static {v0}, Li7/j;->g(Lf7/v;)Lf7/x;

    move-result-object v0

    sput-object v0, Li7/j;->c:Lf7/x;

    return-void
.end method

.method private constructor <init>(Lf7/e;Lf7/v;)V
    .locals 0

    invoke-direct {p0}, Lf7/w;-><init>()V

    iput-object p1, p0, Li7/j;->a:Lf7/e;

    iput-object p2, p0, Li7/j;->b:Lf7/v;

    return-void
.end method

.method synthetic constructor <init>(Lf7/e;Lf7/v;Li7/j$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Li7/j;-><init>(Lf7/e;Lf7/v;)V

    return-void
.end method

.method public static f(Lf7/v;)Lf7/x;
    .locals 1

    sget-object v0, Lf7/u;->n:Lf7/u;

    if-ne p0, v0, :cond_0

    sget-object p0, Li7/j;->c:Lf7/x;

    return-object p0

    :cond_0
    invoke-static {p0}, Li7/j;->g(Lf7/v;)Lf7/x;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lf7/v;)Lf7/x;
    .locals 1

    new-instance v0, Li7/j$a;

    invoke-direct {v0, p0}, Li7/j$a;-><init>(Lf7/v;)V

    return-object v0
.end method


# virtual methods
.method public c(Ln7/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    move-result-object v0

    sget-object v1, Li7/j$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Ln7/a;->S()V

    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Ln7/a;->D()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Li7/j;->b:Lf7/v;

    invoke-interface {v0, p1}, Lf7/v;->e(Ln7/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Ln7/a;->X()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance v0, Lh7/h;

    invoke-direct {v0}, Lh7/h;-><init>()V

    invoke-virtual {p1}, Ln7/a;->b()V

    :goto_0
    invoke-virtual {p1}, Ln7/a;->r()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ln7/a;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Li7/j;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ln7/a;->o()V

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ln7/a;->a()V

    :goto_1
    invoke-virtual {p1}, Ln7/a;->r()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Li7/j;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ln7/a;->k()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ln7/c;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ln7/c;->D()Ln7/c;

    return-void

    :cond_0
    iget-object v0, p0, Li7/j;->a:Lf7/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf7/e;->j(Ljava/lang/Class;)Lf7/w;

    move-result-object v0

    instance-of v1, v0, Li7/j;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ln7/c;->f()Ln7/c;

    invoke-virtual {p1}, Ln7/c;->o()Ln7/c;

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    return-void
.end method
