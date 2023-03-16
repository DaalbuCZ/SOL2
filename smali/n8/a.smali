.class public Ln8/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x18
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/a$c;
    }
.end annotation


# static fields
.field private static c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ln8/a$c;

.field private final b:Lk8/g;


# direct methods
.method public constructor <init>(Ln8/a$c;Lk8/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln8/a;->a:Ln8/a$c;

    iput-object p2, p0, Ln8/a;->b:Lk8/g;

    new-instance p1, Ln8/a$a;

    invoke-direct {p1, p0}, Ln8/a$a;-><init>(Ln8/a;)V

    invoke-virtual {p2, p1}, Lk8/g;->b(Lk8/g$b;)V

    return-void
.end method

.method static synthetic a(Ln8/a;Ljava/lang/String;)Landroid/view/PointerIcon;
    .locals 0

    invoke-direct {p0, p1}, Ln8/a;->d(Ljava/lang/String;)Landroid/view/PointerIcon;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Ln8/a;)Ln8/a$c;
    .locals 0

    iget-object p0, p0, Ln8/a;->a:Ln8/a$c;

    return-object p0
.end method

.method private d(Ljava/lang/String;)Landroid/view/PointerIcon;
    .locals 2

    sget-object v0, Ln8/a;->c:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ln8/a$b;

    invoke-direct {v0, p0}, Ln8/a$b;-><init>(Ln8/a;)V

    sput-object v0, Ln8/a;->c:Ljava/util/HashMap;

    :cond_0
    sget-object v0, Ln8/a;->c:Ljava/util/HashMap;

    const/16 v1, 0x3e8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lj$/util/Map$-EL;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Ln8/a;->a:Ln8/a$c;

    invoke-interface {v0, p1}, Ln8/a$c;->b(I)Landroid/view/PointerIcon;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Ln8/a;->b:Lk8/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lk8/g;->b(Lk8/g$b;)V

    return-void
.end method
