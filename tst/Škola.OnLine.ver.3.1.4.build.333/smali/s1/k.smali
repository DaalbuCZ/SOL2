.class public final synthetic Ls1/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/b$a;


# instance fields
.field public final synthetic a:Ls1/s;

.field public final synthetic b:Ljava/lang/Iterable;


# direct methods
.method public synthetic constructor <init>(Ls1/s;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/k;->a:Ls1/s;

    iput-object p2, p0, Ls1/k;->b:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ls1/k;->a:Ls1/s;

    iget-object v1, p0, Ls1/k;->b:Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ls1/s;->g(Ls1/s;Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
