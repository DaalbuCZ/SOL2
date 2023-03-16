.class public final synthetic Ls1/q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls1/p2$e;

.field public final synthetic c:Ls1/p2$e;


# direct methods
.method public synthetic constructor <init>(ILs1/p2$e;Ls1/p2$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls1/q0;->a:I

    iput-object p2, p0, Ls1/q0;->b:Ls1/p2$e;

    iput-object p3, p0, Ls1/q0;->c:Ls1/p2$e;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Ls1/q0;->a:I

    iget-object v1, p0, Ls1/q0;->b:Ls1/p2$e;

    iget-object v2, p0, Ls1/q0;->c:Ls1/p2$e;

    check-cast p1, Ls1/p2$d;

    invoke-static {v0, v1, v2, p1}, Ls1/w0;->a0(ILs1/p2$e;Ls1/p2$e;Ls1/p2$d;)V

    return-void
.end method
