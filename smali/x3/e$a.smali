.class public Lx3/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx3/e$a$a;
    }
.end annotation


# static fields
.field public static final c:Lx3/e$a;


# instance fields
.field public final a:Ly3/k;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx3/e$a$a;

    invoke-direct {v0}, Lx3/e$a$a;-><init>()V

    invoke-virtual {v0}, Lx3/e$a$a;->a()Lx3/e$a;

    move-result-object v0

    sput-object v0, Lx3/e$a;->c:Lx3/e$a;

    return-void
.end method

.method private constructor <init>(Ly3/k;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/e$a;->a:Ly3/k;

    iput-object p3, p0, Lx3/e$a;->b:Landroid/os/Looper;

    return-void
.end method

.method synthetic constructor <init>(Ly3/k;Landroid/accounts/Account;Landroid/os/Looper;Lx3/m;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3}, Lx3/e$a;-><init>(Ly3/k;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method
