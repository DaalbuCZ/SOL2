.class final Lk1/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lk1/j;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lk1/b$b;

.field private static final b:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk1/b$b;

    invoke-direct {v0}, Lk1/b$b;-><init>()V

    sput-object v0, Lk1/b$b;->a:Lk1/b$b;

    const-string v0, "logRequest"

    invoke-static {v0}, Lg6/c;->d(Ljava/lang/String;)Lg6/c;

    move-result-object v0

    sput-object v0, Lk1/b$b;->b:Lg6/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lk1/j;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Lk1/b$b;->b(Lk1/j;Lg6/e;)V

    return-void
.end method

.method public b(Lk1/j;Lg6/e;)V
    .locals 1

    sget-object v0, Lk1/b$b;->b:Lg6/c;

    invoke-virtual {p1}, Lk1/j;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
