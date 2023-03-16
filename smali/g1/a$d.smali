.class final Lg1/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb6/d<",
        "Lj1/d;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lg1/a$d;

.field private static final b:Lb6/c;

.field private static final c:Lb6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg1/a$d;

    invoke-direct {v0}, Lg1/a$d;-><init>()V

    sput-object v0, Lg1/a$d;->a:Lg1/a$d;

    const-string v0, "logSource"

    invoke-static {v0}, Lb6/c;->a(Ljava/lang/String;)Lb6/c$b;

    move-result-object v0

    invoke-static {}, Le6/a;->b()Le6/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Le6/a;->c(I)Le6/a;

    move-result-object v1

    invoke-virtual {v1}, Le6/a;->a()Le6/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb6/c$b;->b(Ljava/lang/annotation/Annotation;)Lb6/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb6/c$b;->a()Lb6/c;

    move-result-object v0

    sput-object v0, Lg1/a$d;->b:Lb6/c;

    const-string v0, "logEventDropped"

    invoke-static {v0}, Lb6/c;->a(Ljava/lang/String;)Lb6/c$b;

    move-result-object v0

    invoke-static {}, Le6/a;->b()Le6/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Le6/a;->c(I)Le6/a;

    move-result-object v1

    invoke-virtual {v1}, Le6/a;->a()Le6/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb6/c$b;->b(Ljava/lang/annotation/Annotation;)Lb6/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lb6/c$b;->a()Lb6/c;

    move-result-object v0

    sput-object v0, Lg1/a$d;->c:Lb6/c;

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

    check-cast p1, Lj1/d;

    check-cast p2, Lb6/e;

    invoke-virtual {p0, p1, p2}, Lg1/a$d;->b(Lj1/d;Lb6/e;)V

    return-void
.end method

.method public b(Lj1/d;Lb6/e;)V
    .locals 2

    sget-object v0, Lg1/a$d;->b:Lb6/c;

    invoke-virtual {p1}, Lj1/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    sget-object v0, Lg1/a$d;->c:Lb6/c;

    invoke-virtual {p1}, Lj1/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lb6/e;->f(Lb6/c;Ljava/lang/Object;)Lb6/e;

    return-void
.end method
