.class public final Ln7/a;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lk7/w<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Lk7/x;


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final b:Lk7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/w<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln7/a$a;

    invoke-direct {v0}, Ln7/a$a;-><init>()V

    sput-object v0, Ln7/a;->c:Lk7/x;

    return-void
.end method

.method public constructor <init>(Lk7/e;Lk7/w;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/e;",
            "Lk7/w<",
            "TE;>;",
            "Ljava/lang/Class<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lk7/w;-><init>()V

    new-instance v0, Ln7/m;

    invoke-direct {v0, p1, p2, p3}, Ln7/m;-><init>(Lk7/e;Lk7/w;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Ln7/a;->b:Lk7/w;

    iput-object p3, p0, Ln7/a;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public c(Ls7/a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v0

    sget-object v1, Ls7/b;->v:Ls7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ls7/a;->V()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ls7/a;->a()V

    :goto_0
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ln7/a;->b:Lk7/w;

    invoke-virtual {v1, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ls7/a;->l()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    iget-object v1, p0, Ln7/a;->a:Ljava/lang/Class;

    invoke-static {v1, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v1
.end method

.method public e(Ls7/c;Ljava/lang/Object;)V
    .locals 4

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Ls7/c;->c()Ls7/c;

    const/4 v0, 0x0

    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Ln7/a;->b:Lk7/w;

    invoke-virtual {v3, p1, v2}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ls7/c;->l()Ls7/c;

    return-void
.end method
