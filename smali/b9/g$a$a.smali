.class final Lb9/g$a$a;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb9/g$a;->a(Lb9/g;Lb9/g;)Lb9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/p<",
        "Lb9/g;",
        "Lb9/g$b;",
        "Lb9/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Lb9/g$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb9/g$a$a;

    invoke-direct {v0}, Lb9/g$a$a;-><init>()V

    sput-object v0, Lb9/g$a$a;->o:Lb9/g$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lb9/g;Lb9/g$b;)Lb9/g;
    .locals 3

    const-string v0, "acc"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lb9/g$b;->getKey()Lb9/g$c;

    move-result-object v0

    invoke-interface {p1, v0}, Lb9/g;->B(Lb9/g$c;)Lb9/g;

    move-result-object p1

    sget-object v0, Lb9/h;->n:Lb9/h;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lb9/e;->b:Lb9/e$b;

    invoke-interface {p1, v1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v2

    check-cast v2, Lb9/e;

    if-nez v2, :cond_1

    new-instance v0, Lb9/c;

    invoke-direct {v0, p1, p2}, Lb9/c;-><init>(Lb9/g;Lb9/g$b;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lb9/g;->B(Lb9/g$c;)Lb9/g;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Lb9/c;

    invoke-direct {p1, p2, v2}, Lb9/c;-><init>(Lb9/g;Lb9/g$b;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Lb9/c;

    new-instance v1, Lb9/c;

    invoke-direct {v1, p1, p2}, Lb9/c;-><init>(Lb9/g;Lb9/g$b;)V

    invoke-direct {v0, v1, v2}, Lb9/c;-><init>(Lb9/g;Lb9/g$b;)V

    goto :goto_0

    :goto_1
    return-object p2
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb9/g;

    check-cast p2, Lb9/g$b;

    invoke-virtual {p0, p1, p2}, Lb9/g$a$a;->a(Lb9/g;Lb9/g$b;)Lb9/g;

    move-result-object p1

    return-object p1
.end method
