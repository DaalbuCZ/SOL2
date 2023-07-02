.class public final synthetic Lx1/r0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx1/c3$e;

.field public final synthetic c:Lx1/c3$e;


# direct methods
.method public synthetic constructor <init>(ILx1/c3$e;Lx1/c3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lx1/r0;->a:I

    iput-object p2, p0, Lx1/r0;->b:Lx1/c3$e;

    iput-object p3, p0, Lx1/r0;->c:Lx1/c3$e;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lx1/r0;->a:I

    iget-object v1, p0, Lx1/r0;->b:Lx1/c3$e;

    iget-object v2, p0, Lx1/r0;->c:Lx1/c3$e;

    check-cast p1, Lx1/c3$d;

    invoke-static {v0, v1, v2, p1}, Lx1/x0;->b0(ILx1/c3$e;Lx1/c3$e;Lx1/c3$d;)V

    return-void
.end method
