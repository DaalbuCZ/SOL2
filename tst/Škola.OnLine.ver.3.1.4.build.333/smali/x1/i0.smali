.class public final synthetic Lx1/i0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Lx1/z2;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lx1/z2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/i0;->a:Lx1/z2;

    iput p2, p0, Lx1/i0;->b:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lx1/i0;->a:Lx1/z2;

    iget v1, p0, Lx1/i0;->b:I

    check-cast p1, Lx1/c3$d;

    invoke-static {v0, v1, p1}, Lx1/x0;->l0(Lx1/z2;ILx1/c3$d;)V

    return-void
.end method
