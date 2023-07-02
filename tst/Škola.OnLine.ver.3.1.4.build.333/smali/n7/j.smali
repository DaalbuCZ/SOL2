.class public final Ln7/j;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk7/w<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final c:Lk7/x;


# instance fields
.field private final a:Lk7/e;

.field private final b:Lk7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lk7/u;->n:Lk7/u;

    invoke-static {v0}, Ln7/j;->g(Lk7/v;)Lk7/x;

    move-result-object v0

    sput-object v0, Ln7/j;->c:Lk7/x;

    return-void
.end method

.method private constructor <init>(Lk7/e;Lk7/v;)V
    .locals 0

    invoke-direct {p0}, Lk7/w;-><init>()V

    iput-object p1, p0, Ln7/j;->a:Lk7/e;

    iput-object p2, p0, Ln7/j;->b:Lk7/v;

    return-void
.end method

.method synthetic constructor <init>(Lk7/e;Lk7/v;Ln7/j$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ln7/j;-><init>(Lk7/e;Lk7/v;)V

    return-void
.end method

.method public static f(Lk7/v;)Lk7/x;
    .locals 1

    sget-object v0, Lk7/u;->n:Lk7/u;

    if-ne p0, v0, :cond_0

    sget-object p0, Ln7/j;->c:Lk7/x;

    return-object p0

    :cond_0
    invoke-static {p0}, Ln7/j;->g(Lk7/v;)Lk7/x;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lk7/v;)Lk7/x;
    .locals 1

    new-instance v0, Ln7/j$a;

    invoke-direct {v0, p0}, Ln7/j$a;-><init>(Lk7/v;)V

    return-object v0
.end method


# virtual methods
.method public c(Ls7/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v0

    sget-object v1, Ln7/j$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Ls7/a;->V()V

    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Ls7/a;->F()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ln7/j;->b:Lk7/v;

    invoke-interface {v0, p1}, Lk7/v;->e(Ls7/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Ls7/a;->X()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance v0, Lm7/h;

    invoke-direct {v0}, Lm7/h;-><init>()V

    invoke-virtual {p1}, Ls7/a;->b()V

    :goto_0
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ls7/a;->Q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Ln7/j;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ls7/a;->n()V

    return-object v0

    :pswitch_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ls7/a;->a()V

    :goto_1
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Ln7/j;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ls7/a;->l()V

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

.method public e(Ls7/c;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_0
    iget-object v0, p0, Ln7/j;->a:Lk7/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk7/e;->j(Ljava/lang/Class;)Lk7/w;

    move-result-object v0

    instance-of v1, v0, Ln7/j;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ls7/c;->e()Ls7/c;

    invoke-virtual {p1}, Ls7/c;->n()Ls7/c;

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    return-void
.end method
