.class final Ll1/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg6/d<",
        "Lo1/d;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Ll1/a$d;

.field private static final b:Lg6/c;

.field private static final c:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll1/a$d;

    invoke-direct {v0}, Ll1/a$d;-><init>()V

    sput-object v0, Ll1/a$d;->a:Ll1/a$d;

    const-string v0, "logSource"

    invoke-static {v0}, Lg6/c;->a(Ljava/lang/String;)Lg6/c$b;

    move-result-object v0

    invoke-static {}, Lj6/a;->b()Lj6/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lj6/a;->c(I)Lj6/a;

    move-result-object v1

    invoke-virtual {v1}, Lj6/a;->a()Lj6/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg6/c$b;->b(Ljava/lang/annotation/Annotation;)Lg6/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lg6/c$b;->a()Lg6/c;

    move-result-object v0

    sput-object v0, Ll1/a$d;->b:Lg6/c;

    const-string v0, "logEventDropped"

    invoke-static {v0}, Lg6/c;->a(Ljava/lang/String;)Lg6/c$b;

    move-result-object v0

    invoke-static {}, Lj6/a;->b()Lj6/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lj6/a;->c(I)Lj6/a;

    move-result-object v1

    invoke-virtual {v1}, Lj6/a;->a()Lj6/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg6/c$b;->b(Ljava/lang/annotation/Annotation;)Lg6/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lg6/c$b;->a()Lg6/c;

    move-result-object v0

    sput-object v0, Ll1/a$d;->c:Lg6/c;

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

    check-cast p1, Lo1/d;

    check-cast p2, Lg6/e;

    invoke-virtual {p0, p1, p2}, Ll1/a$d;->b(Lo1/d;Lg6/e;)V

    return-void
.end method

.method public b(Lo1/d;Lg6/e;)V
    .locals 2

    sget-object v0, Ll1/a$d;->b:Lg6/c;

    invoke-virtual {p1}, Lo1/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    sget-object v0, Ll1/a$d;->c:Lg6/c;

    invoke-virtual {p1}, Lo1/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lg6/e;->a(Lg6/c;Ljava/lang/Object;)Lg6/e;

    return-void
.end method
