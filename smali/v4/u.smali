.class public final synthetic Lv4/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/d;


# instance fields
.field public final synthetic a:Lv4/d0;

.field public final synthetic b:Lt4/j;


# direct methods
.method public synthetic constructor <init>(Lv4/d0;Lt4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/u;->a:Lv4/d0;

    iput-object p2, p0, Lv4/u;->b:Lt4/j;

    return-void
.end method


# virtual methods
.method public final a(Lt4/i;)V
    .locals 2

    iget-object v0, p0, Lv4/u;->a:Lv4/d0;

    iget-object v1, p0, Lv4/u;->b:Lt4/j;

    invoke-virtual {v0, v1, p1}, Lv4/d0;->q(Lt4/j;Lt4/i;)V

    return-void
.end method
