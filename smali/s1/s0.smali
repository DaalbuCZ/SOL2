.class public final synthetic Ls1/s0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Ls1/u1;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ls1/u1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/s0;->a:Ls1/u1;

    iput p2, p0, Ls1/s0;->b:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ls1/s0;->a:Ls1/u1;

    iget v1, p0, Ls1/s0;->b:I

    check-cast p1, Ls1/p2$d;

    invoke-static {v0, v1, p1}, Ls1/w0;->f0(Ls1/u1;ILs1/p2$d;)V

    return-void
.end method
