.class Lv5/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv5/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/k;->z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lc6/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv5/k;


# direct methods
.method constructor <init>(Lv5/k;)V
    .locals 0

    iput-object p1, p0, Lv5/k$a;->a:Lv5/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc6/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lv5/k$a;->a:Lv5/k;

    invoke-virtual {v0, p1, p2, p3}, Lv5/k;->H(Lc6/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
