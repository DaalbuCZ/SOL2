.class public final synthetic Lt1/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/q$a;


# instance fields
.field public final synthetic a:Lt1/c$a;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lt1/c$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/e;->a:Lt1/c$a;

    iput p2, p0, Lt1/e;->b:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt1/e;->a:Lt1/c$a;

    iget v1, p0, Lt1/e;->b:I

    check-cast p1, Lt1/c;

    invoke-static {v0, v1, p1}, Lt1/o1;->O0(Lt1/c$a;ILt1/c;)V

    return-void
.end method
